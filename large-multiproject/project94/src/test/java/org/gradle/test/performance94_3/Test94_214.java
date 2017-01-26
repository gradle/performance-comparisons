package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_214 {
    private final Production94_214 production = new Production94_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}