package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_467 {
    private final Production94_467 production = new Production94_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}