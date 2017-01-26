package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38503 {
    private final Productionnull_38503 production = new Productionnull_38503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}