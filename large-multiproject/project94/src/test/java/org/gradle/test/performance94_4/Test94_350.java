package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_350 {
    private final Production94_350 production = new Production94_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}