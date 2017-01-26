package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_145 {
    private final Production94_145 production = new Production94_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}