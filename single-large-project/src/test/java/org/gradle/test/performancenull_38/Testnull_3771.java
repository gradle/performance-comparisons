package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3771 {
    private final Productionnull_3771 production = new Productionnull_3771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}