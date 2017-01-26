package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_21 {
    private final Production2_21 production = new Production2_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}