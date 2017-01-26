package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_357 {
    private final Production90_357 production = new Production90_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}