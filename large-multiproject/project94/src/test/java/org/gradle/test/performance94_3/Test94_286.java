package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_286 {
    private final Production94_286 production = new Production94_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}