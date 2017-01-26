package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_139 {
    private final Production2_139 production = new Production2_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}