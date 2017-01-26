package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_252 {
    private final Production2_252 production = new Production2_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}