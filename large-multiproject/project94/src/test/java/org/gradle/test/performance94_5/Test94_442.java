package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_442 {
    private final Production94_442 production = new Production94_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}