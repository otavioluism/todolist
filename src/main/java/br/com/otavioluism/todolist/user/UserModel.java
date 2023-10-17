package br.com.otavioluism.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // annotation para ter o setter e getter configurado na classe
@Entity(name = "tb_users") // Entity e a traducao do nome da tabela por ORM para criar no banco
public class UserModel {

  @Id // forcando a variavel ser uma chave primary key
  @GeneratedValue(generator = "UUID") // gerar id automativo no formato UUID
  private UUID id;

  private String name; 

  @Column(unique = true)
  private String username; 
  
  private String password; 

  @CreationTimestamp // pegando o horario atual da criacao
  private LocalDateTime createdAt; 

}
