package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_38 {
    private final Production58_38 production = new Production58_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}