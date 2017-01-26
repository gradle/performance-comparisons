package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_3 {
    private final Production58_3 production = new Production58_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}