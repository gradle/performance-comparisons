package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_282 {
    private final Production67_282 production = new Production67_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}