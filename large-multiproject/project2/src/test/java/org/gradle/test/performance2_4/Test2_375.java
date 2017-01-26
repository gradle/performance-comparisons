package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_375 {
    private final Production2_375 production = new Production2_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}