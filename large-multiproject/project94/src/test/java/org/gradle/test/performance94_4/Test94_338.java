package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_338 {
    private final Production94_338 production = new Production94_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}