package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_158 {
    private final Production2_158 production = new Production2_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}