package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23863 {
    private final Productionnull_23863 production = new Productionnull_23863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}