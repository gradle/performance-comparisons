package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_336 {
    private final Production94_336 production = new Production94_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}