package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_216 {
    private final Production30_216 production = new Production30_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}