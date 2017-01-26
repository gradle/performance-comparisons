package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_484 {
    private final Production3_484 production = new Production3_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}