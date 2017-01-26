package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_424 {
    private final Production67_424 production = new Production67_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}