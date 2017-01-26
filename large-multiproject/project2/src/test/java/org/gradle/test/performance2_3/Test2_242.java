package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_242 {
    private final Production2_242 production = new Production2_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}