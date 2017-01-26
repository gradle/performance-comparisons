package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_146 {
    private final Production94_146 production = new Production94_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}