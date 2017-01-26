package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_203 {
    private final Production94_203 production = new Production94_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}