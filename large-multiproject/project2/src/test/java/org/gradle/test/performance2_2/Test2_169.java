package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_169 {
    private final Production2_169 production = new Production2_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}