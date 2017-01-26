package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_236 {
    private final Production2_236 production = new Production2_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}