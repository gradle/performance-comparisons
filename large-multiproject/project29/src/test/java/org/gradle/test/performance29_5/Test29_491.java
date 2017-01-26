package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_491 {
    private final Production29_491 production = new Production29_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}