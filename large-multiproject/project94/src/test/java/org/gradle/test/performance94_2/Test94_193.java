package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_193 {
    private final Production94_193 production = new Production94_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}