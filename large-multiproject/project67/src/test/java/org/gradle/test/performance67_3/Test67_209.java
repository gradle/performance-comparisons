package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_209 {
    private final Production67_209 production = new Production67_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}