package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_30 {
    private final Production36_30 production = new Production36_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}