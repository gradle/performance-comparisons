package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_104 {
    private final Production94_104 production = new Production94_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}