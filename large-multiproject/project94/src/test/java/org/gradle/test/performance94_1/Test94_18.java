package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_18 {
    private final Production94_18 production = new Production94_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}