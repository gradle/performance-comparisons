package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_131 {
    private final Production36_131 production = new Production36_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}