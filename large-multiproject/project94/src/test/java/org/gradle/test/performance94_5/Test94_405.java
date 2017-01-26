package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_405 {
    private final Production94_405 production = new Production94_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}