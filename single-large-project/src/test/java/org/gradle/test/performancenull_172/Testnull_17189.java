package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17189 {
    private final Productionnull_17189 production = new Productionnull_17189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}