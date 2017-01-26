package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_165 {
    private final Production2_165 production = new Production2_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}