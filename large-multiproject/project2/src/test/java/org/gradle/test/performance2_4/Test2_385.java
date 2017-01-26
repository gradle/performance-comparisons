package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_385 {
    private final Production2_385 production = new Production2_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}