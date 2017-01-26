package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_465 {
    private final Production94_465 production = new Production94_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}