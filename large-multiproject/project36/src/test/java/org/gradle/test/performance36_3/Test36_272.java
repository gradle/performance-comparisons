package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_272 {
    private final Production36_272 production = new Production36_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}