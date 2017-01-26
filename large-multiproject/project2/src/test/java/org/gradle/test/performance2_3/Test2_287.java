package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_287 {
    private final Production2_287 production = new Production2_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}