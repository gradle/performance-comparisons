package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_147 {
    private final Production2_147 production = new Production2_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}