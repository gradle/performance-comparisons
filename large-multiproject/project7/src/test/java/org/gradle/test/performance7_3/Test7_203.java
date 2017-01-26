package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_203 {
    private final Production7_203 production = new Production7_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}