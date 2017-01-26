package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_338 {
    private final Production67_338 production = new Production67_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}