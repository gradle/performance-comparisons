package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_12 {
    private final Production94_12 production = new Production94_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}