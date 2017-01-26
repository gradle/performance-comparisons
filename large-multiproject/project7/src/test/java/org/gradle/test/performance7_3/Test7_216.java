package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_216 {
    private final Production7_216 production = new Production7_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}