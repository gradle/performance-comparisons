package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_180 {
    private final Production2_180 production = new Production2_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}