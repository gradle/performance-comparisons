package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_357 {
    private final Production81_357 production = new Production81_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}