package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_458 {
    private final Production94_458 production = new Production94_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}