package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_429 {
    private final Production2_429 production = new Production2_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}