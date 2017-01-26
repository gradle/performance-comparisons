package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_80 {
    private final Production58_80 production = new Production58_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}