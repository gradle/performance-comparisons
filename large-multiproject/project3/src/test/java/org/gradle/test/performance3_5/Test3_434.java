package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_434 {
    private final Production3_434 production = new Production3_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}