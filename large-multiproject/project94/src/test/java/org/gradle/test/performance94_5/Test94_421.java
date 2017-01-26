package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_421 {
    private final Production94_421 production = new Production94_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}