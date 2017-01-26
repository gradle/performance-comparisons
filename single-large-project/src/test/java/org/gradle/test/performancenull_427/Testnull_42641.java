package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42641 {
    private final Productionnull_42641 production = new Productionnull_42641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}