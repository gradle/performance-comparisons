package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_232 {
    private final Production2_232 production = new Production2_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}