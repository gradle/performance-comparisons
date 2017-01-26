package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_347 {
    private final Production67_347 production = new Production67_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}