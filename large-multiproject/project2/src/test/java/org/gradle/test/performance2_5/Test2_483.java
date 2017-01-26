package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_483 {
    private final Production2_483 production = new Production2_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}