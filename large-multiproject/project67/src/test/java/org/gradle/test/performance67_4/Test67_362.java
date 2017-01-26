package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_362 {
    private final Production67_362 production = new Production67_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}