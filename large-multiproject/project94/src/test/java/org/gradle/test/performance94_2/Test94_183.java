package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_183 {
    private final Production94_183 production = new Production94_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}