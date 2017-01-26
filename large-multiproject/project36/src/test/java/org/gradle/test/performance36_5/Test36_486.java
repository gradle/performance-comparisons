package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_486 {
    private final Production36_486 production = new Production36_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}