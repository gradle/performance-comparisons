package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41432 {
    private final Productionnull_41432 production = new Productionnull_41432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}