package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_98 {
    private final Production94_98 production = new Production94_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}