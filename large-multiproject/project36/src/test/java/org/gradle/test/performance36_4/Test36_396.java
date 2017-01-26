package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_396 {
    private final Production36_396 production = new Production36_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}