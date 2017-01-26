package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_229 {
    private final Production67_229 production = new Production67_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}