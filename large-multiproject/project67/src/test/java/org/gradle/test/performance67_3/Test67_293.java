package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_293 {
    private final Production67_293 production = new Production67_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}