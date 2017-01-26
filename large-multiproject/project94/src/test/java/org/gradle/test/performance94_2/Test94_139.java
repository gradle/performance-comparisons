package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_139 {
    private final Production94_139 production = new Production94_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}