package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_220 {
    private final Production2_220 production = new Production2_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}