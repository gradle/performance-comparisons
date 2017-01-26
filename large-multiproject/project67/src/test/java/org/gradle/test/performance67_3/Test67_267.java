package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_267 {
    private final Production67_267 production = new Production67_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}