package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_166 {
    private final Production58_166 production = new Production58_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}