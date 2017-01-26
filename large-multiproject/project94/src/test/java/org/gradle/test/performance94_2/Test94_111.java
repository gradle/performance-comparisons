package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_111 {
    private final Production94_111 production = new Production94_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}