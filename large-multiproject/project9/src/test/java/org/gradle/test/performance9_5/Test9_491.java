package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_491 {
    private final Production9_491 production = new Production9_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}