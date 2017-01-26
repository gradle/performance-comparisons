package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_323 {
    private final Production67_323 production = new Production67_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}