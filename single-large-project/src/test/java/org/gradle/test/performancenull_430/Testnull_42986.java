package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42986 {
    private final Productionnull_42986 production = new Productionnull_42986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}