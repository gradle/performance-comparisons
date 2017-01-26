package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_206 {
    private final Production2_206 production = new Production2_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}