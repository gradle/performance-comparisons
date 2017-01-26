package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_321 {
    private final Production2_321 production = new Production2_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}