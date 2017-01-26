package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_54 {
    private final Production94_54 production = new Production94_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}