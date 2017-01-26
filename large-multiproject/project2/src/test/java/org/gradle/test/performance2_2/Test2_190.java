package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_190 {
    private final Production2_190 production = new Production2_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}