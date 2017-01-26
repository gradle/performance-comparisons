package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_363 {
    private final Production36_363 production = new Production36_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}