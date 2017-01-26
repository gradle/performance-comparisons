package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_41 {
    private final Production58_41 production = new Production58_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}