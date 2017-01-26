package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_337 {
    private final Production94_337 production = new Production94_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}