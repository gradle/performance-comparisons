package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_357 {
    private final Production63_357 production = new Production63_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}