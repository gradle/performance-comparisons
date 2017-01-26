package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_405 {
    private final Production36_405 production = new Production36_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}