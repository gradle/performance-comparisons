package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10282 {
    private final Productionnull_10282 production = new Productionnull_10282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}