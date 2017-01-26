package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_91 {
    private final Production58_91 production = new Production58_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}