package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_370 {
    private final Production36_370 production = new Production36_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}