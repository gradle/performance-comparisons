package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_203 {
    private final Production36_203 production = new Production36_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}