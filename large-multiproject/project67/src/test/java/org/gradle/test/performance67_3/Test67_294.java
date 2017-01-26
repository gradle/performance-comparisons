package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_294 {
    private final Production67_294 production = new Production67_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}