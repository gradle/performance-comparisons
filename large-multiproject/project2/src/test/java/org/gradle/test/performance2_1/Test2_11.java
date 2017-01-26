package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_11 {
    private final Production2_11 production = new Production2_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}