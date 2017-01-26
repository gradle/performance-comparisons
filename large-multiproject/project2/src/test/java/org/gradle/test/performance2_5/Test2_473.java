package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_473 {
    private final Production2_473 production = new Production2_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}