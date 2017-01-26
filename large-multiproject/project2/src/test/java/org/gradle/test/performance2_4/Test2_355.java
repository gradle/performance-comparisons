package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_355 {
    private final Production2_355 production = new Production2_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}