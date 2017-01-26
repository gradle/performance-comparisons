package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_138 {
    private final Production94_138 production = new Production94_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}