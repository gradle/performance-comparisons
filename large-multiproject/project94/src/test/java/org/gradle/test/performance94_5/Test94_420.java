package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_420 {
    private final Production94_420 production = new Production94_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}