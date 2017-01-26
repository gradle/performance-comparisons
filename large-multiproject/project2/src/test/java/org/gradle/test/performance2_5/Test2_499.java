package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_499 {
    private final Production2_499 production = new Production2_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}