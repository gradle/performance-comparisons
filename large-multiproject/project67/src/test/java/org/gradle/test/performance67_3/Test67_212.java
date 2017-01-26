package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_212 {
    private final Production67_212 production = new Production67_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}