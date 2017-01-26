package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_251 {
    private final Production67_251 production = new Production67_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}