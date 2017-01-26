package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_77 {
    private final Production31_77 production = new Production31_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}