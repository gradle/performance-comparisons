package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_126 {
    private final Production58_126 production = new Production58_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}