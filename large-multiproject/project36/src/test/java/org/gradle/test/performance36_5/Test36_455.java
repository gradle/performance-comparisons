package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_455 {
    private final Production36_455 production = new Production36_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}