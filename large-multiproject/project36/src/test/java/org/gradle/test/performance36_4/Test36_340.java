package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_340 {
    private final Production36_340 production = new Production36_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}