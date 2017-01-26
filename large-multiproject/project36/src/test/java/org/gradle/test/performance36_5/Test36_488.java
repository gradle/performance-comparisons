package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_488 {
    private final Production36_488 production = new Production36_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}