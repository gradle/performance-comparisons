package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41172 {
    private final Productionnull_41172 production = new Productionnull_41172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}