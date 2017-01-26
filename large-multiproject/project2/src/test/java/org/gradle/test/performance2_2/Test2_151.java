package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_151 {
    private final Production2_151 production = new Production2_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}