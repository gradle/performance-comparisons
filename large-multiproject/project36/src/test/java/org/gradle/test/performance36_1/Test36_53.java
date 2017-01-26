package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_53 {
    private final Production36_53 production = new Production36_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}