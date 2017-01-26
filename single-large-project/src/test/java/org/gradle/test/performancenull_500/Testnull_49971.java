package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49971 {
    private final Productionnull_49971 production = new Productionnull_49971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}