package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_147 {
    private final Production30_147 production = new Production30_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}