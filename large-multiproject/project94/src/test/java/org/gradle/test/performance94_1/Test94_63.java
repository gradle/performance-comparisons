package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_63 {
    private final Production94_63 production = new Production94_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}