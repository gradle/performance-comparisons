package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_477 {
    private final Production36_477 production = new Production36_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}