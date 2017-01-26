package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_141 {
    private final Production2_141 production = new Production2_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}