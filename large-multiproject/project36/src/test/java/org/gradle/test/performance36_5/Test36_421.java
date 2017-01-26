package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_421 {
    private final Production36_421 production = new Production36_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}