package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_147 {
    private final Production58_147 production = new Production58_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}