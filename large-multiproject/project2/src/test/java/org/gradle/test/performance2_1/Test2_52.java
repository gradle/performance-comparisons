package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_52 {
    private final Production2_52 production = new Production2_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}