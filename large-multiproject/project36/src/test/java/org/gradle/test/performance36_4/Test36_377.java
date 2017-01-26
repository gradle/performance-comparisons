package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_377 {
    private final Production36_377 production = new Production36_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}