package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34042 {
    private final Productionnull_34042 production = new Productionnull_34042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}