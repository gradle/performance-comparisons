package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38594 {
    private final Productionnull_38594 production = new Productionnull_38594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}