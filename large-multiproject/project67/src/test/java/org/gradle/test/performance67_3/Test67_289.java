package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_289 {
    private final Production67_289 production = new Production67_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}