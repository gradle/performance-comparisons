package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_457 {
    private final Production94_457 production = new Production94_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}