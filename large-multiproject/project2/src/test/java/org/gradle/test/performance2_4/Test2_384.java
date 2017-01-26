package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_384 {
    private final Production2_384 production = new Production2_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}