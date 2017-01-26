package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_357 {
    private final Production14_357 production = new Production14_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}