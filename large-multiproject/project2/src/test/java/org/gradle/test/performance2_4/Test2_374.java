package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_374 {
    private final Production2_374 production = new Production2_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}