package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_250 {
    private final Production2_250 production = new Production2_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}