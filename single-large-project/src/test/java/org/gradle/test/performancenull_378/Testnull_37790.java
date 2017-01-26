package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37790 {
    private final Productionnull_37790 production = new Productionnull_37790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}