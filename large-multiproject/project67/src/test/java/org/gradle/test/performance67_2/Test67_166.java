package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_166 {
    private final Production67_166 production = new Production67_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}