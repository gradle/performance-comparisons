package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_129 {
    private final Production2_129 production = new Production2_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}