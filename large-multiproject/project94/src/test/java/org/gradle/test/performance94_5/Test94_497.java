package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_497 {
    private final Production94_497 production = new Production94_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}