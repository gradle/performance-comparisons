package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_467 {
    private final Production2_467 production = new Production2_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}