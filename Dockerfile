FROM sbtscala/scala-sbt:graalvm-ce-22.3.3-b1-java17_1.9.6_2.13.12

WORKDIR /app

# Cacheando as dependências e plugins do projeto
COPY build.sbt /app/
COPY project /app/project/
RUN sbt update

# Copiando o código fonte e compila
COPY . /app/
RUN sbt compile

CMD ["sbt", "run"]