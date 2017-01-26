package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_71 {
    private final Production58_71 production = new Production58_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}