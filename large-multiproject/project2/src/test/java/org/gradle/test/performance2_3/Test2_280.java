package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_280 {
    private final Production2_280 production = new Production2_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}