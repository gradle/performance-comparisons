package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_231 {
    private final Production94_231 production = new Production94_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}