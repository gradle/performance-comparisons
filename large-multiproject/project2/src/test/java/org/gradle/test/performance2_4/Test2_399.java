package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_399 {
    private final Production2_399 production = new Production2_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}