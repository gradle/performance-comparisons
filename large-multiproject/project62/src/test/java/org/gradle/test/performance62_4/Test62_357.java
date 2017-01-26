package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_357 {
    private final Production62_357 production = new Production62_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}