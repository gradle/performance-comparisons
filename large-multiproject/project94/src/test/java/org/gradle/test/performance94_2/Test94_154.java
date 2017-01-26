package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_154 {
    private final Production94_154 production = new Production94_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}