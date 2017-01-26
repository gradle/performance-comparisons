package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_107 {
    private final Production58_107 production = new Production58_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}