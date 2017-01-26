package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_216 {
    private final Production94_216 production = new Production94_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}