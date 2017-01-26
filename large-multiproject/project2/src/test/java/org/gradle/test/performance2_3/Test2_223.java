package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_223 {
    private final Production2_223 production = new Production2_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}