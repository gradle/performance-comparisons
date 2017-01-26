package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_306 {
    private final Production94_306 production = new Production94_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}