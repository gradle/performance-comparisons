package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_48 {
    private final Production94_48 production = new Production94_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}