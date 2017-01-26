package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_342 {
    private final Production2_342 production = new Production2_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}