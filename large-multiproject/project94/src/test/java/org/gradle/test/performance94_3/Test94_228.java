package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_228 {
    private final Production94_228 production = new Production94_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}