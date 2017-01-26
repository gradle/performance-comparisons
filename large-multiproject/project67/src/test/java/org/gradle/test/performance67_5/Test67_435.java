package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_435 {
    private final Production67_435 production = new Production67_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}