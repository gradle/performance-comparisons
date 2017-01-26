package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_25 {
    private final Production94_25 production = new Production94_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}