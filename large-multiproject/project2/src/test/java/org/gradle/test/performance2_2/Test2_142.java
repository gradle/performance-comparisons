package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_142 {
    private final Production2_142 production = new Production2_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}