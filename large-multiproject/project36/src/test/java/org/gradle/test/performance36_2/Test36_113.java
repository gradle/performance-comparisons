package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_113 {
    private final Production36_113 production = new Production36_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}