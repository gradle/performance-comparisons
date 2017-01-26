package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_343 {
    private final Production36_343 production = new Production36_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}