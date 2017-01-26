package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_161 {
    private final Production2_161 production = new Production2_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}