package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_72 {
    private final Production58_72 production = new Production58_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}