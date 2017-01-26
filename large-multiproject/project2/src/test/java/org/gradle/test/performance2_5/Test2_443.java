package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_443 {
    private final Production2_443 production = new Production2_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}