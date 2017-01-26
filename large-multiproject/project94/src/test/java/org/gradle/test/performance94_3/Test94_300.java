package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_300 {
    private final Production94_300 production = new Production94_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}