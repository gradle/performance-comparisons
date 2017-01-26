package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8052 {
    private final Productionnull_8052 production = new Productionnull_8052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}