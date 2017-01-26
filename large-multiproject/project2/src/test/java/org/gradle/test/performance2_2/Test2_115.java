package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_115 {
    private final Production2_115 production = new Production2_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}