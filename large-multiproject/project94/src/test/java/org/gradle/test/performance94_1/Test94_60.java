package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_60 {
    private final Production94_60 production = new Production94_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}