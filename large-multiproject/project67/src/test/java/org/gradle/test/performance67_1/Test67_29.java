package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_29 {
    private final Production67_29 production = new Production67_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}