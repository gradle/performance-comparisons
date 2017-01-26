package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_176 {
    private final Production2_176 production = new Production2_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}