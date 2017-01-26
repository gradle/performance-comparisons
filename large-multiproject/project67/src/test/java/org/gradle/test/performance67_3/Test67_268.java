package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_268 {
    private final Production67_268 production = new Production67_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}