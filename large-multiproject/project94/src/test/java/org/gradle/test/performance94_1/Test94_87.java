package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_87 {
    private final Production94_87 production = new Production94_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}