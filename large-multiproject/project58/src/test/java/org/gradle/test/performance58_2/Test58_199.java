package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_199 {
    private final Production58_199 production = new Production58_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}