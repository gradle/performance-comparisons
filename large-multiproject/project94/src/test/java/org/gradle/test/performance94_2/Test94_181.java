package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_181 {
    private final Production94_181 production = new Production94_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}