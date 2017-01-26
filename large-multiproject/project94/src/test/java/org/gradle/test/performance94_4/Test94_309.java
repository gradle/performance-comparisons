package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_309 {
    private final Production94_309 production = new Production94_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}