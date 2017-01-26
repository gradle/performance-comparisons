package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49162 {
    private final Productionnull_49162 production = new Productionnull_49162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}