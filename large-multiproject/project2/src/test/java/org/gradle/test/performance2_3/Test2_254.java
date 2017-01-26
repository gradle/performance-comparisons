package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_254 {
    private final Production2_254 production = new Production2_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}