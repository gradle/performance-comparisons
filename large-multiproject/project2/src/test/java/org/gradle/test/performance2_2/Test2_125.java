package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_125 {
    private final Production2_125 production = new Production2_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}