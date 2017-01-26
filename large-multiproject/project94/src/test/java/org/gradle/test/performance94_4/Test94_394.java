package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_394 {
    private final Production94_394 production = new Production94_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}