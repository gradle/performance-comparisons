package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_1 {
    private final Production94_1 production = new Production94_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}