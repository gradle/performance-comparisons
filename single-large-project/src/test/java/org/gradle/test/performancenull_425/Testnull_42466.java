package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42466 {
    private final Productionnull_42466 production = new Productionnull_42466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}