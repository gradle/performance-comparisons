package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_91 {
    private final Production67_91 production = new Production67_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}