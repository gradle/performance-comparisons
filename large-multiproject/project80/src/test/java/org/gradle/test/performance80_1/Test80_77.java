package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_77 {
    private final Production80_77 production = new Production80_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}