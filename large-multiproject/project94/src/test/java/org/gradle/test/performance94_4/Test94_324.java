package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_324 {
    private final Production94_324 production = new Production94_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}