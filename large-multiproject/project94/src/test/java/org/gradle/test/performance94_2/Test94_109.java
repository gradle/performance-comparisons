package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_109 {
    private final Production94_109 production = new Production94_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}