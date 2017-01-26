package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_436 {
    private final Production36_436 production = new Production36_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}