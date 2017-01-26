package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_29 {
    private final Production58_29 production = new Production58_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}