package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_82 {
    private final Production67_82 production = new Production67_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}