package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_491 {
    private final Production79_491 production = new Production79_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}