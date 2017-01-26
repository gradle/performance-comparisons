package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_329 {
    private final Production94_329 production = new Production94_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}