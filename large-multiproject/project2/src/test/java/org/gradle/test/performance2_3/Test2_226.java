package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_226 {
    private final Production2_226 production = new Production2_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}