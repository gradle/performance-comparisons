package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_295 {
    private final Production2_295 production = new Production2_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}