package models;
import java.util.ArrayList;
import java.util.List;

public class ticketModel {

  public String title;
  public String desc;
  public String severity;
  public String owner;
  public String responsible;
  public String status;

  public ticketModel() {
  }

  public ticketModel(String ean, String name, String description) {
    this.title = title;
    this.desc = desc;
    this.severity = severity;
    this.owner = owner;
    this.responsible = responsible;
    this.status = status;

  }
  //
  // public String toString() {
  //   return String.format("%s - %s", ean, name);
  // }
  //
  // public static List<ticketModel> findAll() {
  //   return new ArrayList<ticketModel>(tickets);
  // }
  //
  // public static ticketModel findByEan(String ean) {
  //   for (ticketModel candidate : tickets) {
  //     if (candidate.ean.equals(ean)) {
  //       return candidate;
  //     }
  //   }
  //   return null;
  // }
  //
  // public static List<ticketModel> findByName(String term) {
  //   final List<ticketModel> results = new ArrayList<ticketModel>();
  //   for (ticketModel candidate : tickets) {
  //     if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
  //       results.add(candidate);
  //     }
  //   }
  //
  //   return results;
  // }

  // public static boolean remove(ticketModel ticket) {
  //   return tickets.remove(ticket);
  // }
  //
  // public void save() {
  //   tickets.remove(this);
  //   tickets.add(this);
  // }

}
