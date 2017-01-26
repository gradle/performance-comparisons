package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_468 {
    private final Production94_468 production = new Production94_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}