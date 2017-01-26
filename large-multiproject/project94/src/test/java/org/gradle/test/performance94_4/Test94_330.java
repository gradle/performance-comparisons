package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_330 {
    private final Production94_330 production = new Production94_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}