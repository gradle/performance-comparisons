package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_79 {
    private final Production94_79 production = new Production94_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}