package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_175 {
    private final Production94_175 production = new Production94_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}