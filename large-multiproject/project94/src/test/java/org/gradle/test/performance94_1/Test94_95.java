package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_95 {
    private final Production94_95 production = new Production94_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}