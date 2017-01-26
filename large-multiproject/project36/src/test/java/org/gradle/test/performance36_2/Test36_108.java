package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_108 {
    private final Production36_108 production = new Production36_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}