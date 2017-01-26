package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_301 {
    private final Production2_301 production = new Production2_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}