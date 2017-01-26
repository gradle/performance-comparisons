package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_384 {
    private final Production36_384 production = new Production36_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}