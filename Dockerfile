FROM ubuntu:20.04

RUN apt update
RUN apt install default-jdk -y
COPY . .
RUN javac Main.javac

CMD ["java", "Main"]