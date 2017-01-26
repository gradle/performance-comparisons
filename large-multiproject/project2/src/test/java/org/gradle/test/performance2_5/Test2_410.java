package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_410 {
    private final Production2_410 production = new Production2_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}