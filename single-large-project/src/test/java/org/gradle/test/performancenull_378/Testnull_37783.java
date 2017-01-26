package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37783 {
    private final Productionnull_37783 production = new Productionnull_37783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}