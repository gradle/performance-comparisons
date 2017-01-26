package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_389 {
    private final Production2_389 production = new Production2_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}