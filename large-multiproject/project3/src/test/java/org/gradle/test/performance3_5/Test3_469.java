package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_469 {
    private final Production3_469 production = new Production3_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}