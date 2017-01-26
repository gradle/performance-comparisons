package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_244 {
    private final Production2_244 production = new Production2_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}