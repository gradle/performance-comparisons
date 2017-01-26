package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_107 {
    private final Production67_107 production = new Production67_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}