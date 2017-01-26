package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_348 {
    private final Production2_348 production = new Production2_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}