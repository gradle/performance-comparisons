package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_213 {
    private final Production2_213 production = new Production2_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}