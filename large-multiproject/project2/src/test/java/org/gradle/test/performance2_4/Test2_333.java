package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_333 {
    private final Production2_333 production = new Production2_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}