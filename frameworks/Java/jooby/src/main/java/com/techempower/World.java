package com.techempower;

import com.dslplatform.json.CompiledJson;

@CompiledJson
public class World {

  private int id;

  private int randomNumber;

  public World(int id, int randomNumber) {
    this.id = id;
    this.randomNumber = randomNumber;
  }

  public int getId() {
    return id;
  }

  public int getRandomNumber() {
    return randomNumber;
  }
}
