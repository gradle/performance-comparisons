package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_281 {
    private final Production67_281 production = new Production67_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}