package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_147 {
    private final Production7_147 production = new Production7_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}