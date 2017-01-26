package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_325 {
    private final Production67_325 production = new Production67_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}