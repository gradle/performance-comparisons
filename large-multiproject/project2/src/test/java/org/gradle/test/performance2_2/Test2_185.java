package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_185 {
    private final Production2_185 production = new Production2_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}