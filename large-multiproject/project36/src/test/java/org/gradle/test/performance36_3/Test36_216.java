package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_216 {
    private final Production36_216 production = new Production36_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}