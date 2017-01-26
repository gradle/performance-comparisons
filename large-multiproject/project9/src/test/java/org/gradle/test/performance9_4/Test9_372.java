package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_372 {
    private final Production9_372 production = new Production9_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}