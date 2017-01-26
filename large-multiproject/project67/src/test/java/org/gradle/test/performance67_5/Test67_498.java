package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_498 {
    private final Production67_498 production = new Production67_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}