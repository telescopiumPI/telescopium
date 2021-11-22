package Telescopium.Telescopium.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Model {
  @Id @GeneratedValue private String codeMod;

  @NonNull private String nomMod;

  @NonNull private String genreMod;

  @NonNull private Integer pointure;

  @NonNull private double prixMod;

  @NonNull private String couleurMod;

  @ManyToOne
  @JoinColumn(name = "id_transaction", referencedColumnName = "codeTrans")
  private Transaction modelTransaction;
}
