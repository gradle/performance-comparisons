package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_341 {
    private final Production36_341 production = new Production36_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}