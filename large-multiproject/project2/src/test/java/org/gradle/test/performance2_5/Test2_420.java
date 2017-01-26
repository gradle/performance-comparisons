package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_420 {
    private final Production2_420 production = new Production2_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}