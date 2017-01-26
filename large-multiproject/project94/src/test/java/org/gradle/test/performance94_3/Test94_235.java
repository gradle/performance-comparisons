package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_235 {
    private final Production94_235 production = new Production94_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}