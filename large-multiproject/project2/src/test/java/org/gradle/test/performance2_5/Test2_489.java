package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_489 {
    private final Production2_489 production = new Production2_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}