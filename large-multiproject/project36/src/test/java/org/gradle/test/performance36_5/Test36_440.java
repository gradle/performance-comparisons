package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_440 {
    private final Production36_440 production = new Production36_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}