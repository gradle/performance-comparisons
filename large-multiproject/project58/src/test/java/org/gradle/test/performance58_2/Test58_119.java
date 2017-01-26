package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_119 {
    private final Production58_119 production = new Production58_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}