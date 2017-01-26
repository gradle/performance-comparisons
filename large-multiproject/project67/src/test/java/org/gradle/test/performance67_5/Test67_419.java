package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_419 {
    private final Production67_419 production = new Production67_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}