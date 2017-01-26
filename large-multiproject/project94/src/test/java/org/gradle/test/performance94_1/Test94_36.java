package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_36 {
    private final Production94_36 production = new Production94_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}