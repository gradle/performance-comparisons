package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_258 {
    private final Production2_258 production = new Production2_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}