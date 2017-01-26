package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_67 {
    private final Production58_67 production = new Production58_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}