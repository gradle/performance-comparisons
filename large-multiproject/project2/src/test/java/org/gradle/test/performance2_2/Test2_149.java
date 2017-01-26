package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_149 {
    private final Production2_149 production = new Production2_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}