package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_477 {
    private final Production94_477 production = new Production94_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}