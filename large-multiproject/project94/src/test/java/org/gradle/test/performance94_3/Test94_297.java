package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_297 {
    private final Production94_297 production = new Production94_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}