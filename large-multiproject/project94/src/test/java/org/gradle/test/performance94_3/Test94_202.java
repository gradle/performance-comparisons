package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_202 {
    private final Production94_202 production = new Production94_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}