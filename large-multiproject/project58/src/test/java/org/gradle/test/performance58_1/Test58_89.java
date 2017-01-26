package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_89 {
    private final Production58_89 production = new Production58_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}