package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_31 {
    private final Production94_31 production = new Production94_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}