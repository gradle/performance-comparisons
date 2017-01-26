package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_73 {
    private final Production13_73 production = new Production13_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}