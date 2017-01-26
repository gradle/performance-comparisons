package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_244 {
    private final Production94_244 production = new Production94_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}