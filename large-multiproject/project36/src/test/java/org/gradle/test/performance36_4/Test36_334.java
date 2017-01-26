package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_334 {
    private final Production36_334 production = new Production36_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}