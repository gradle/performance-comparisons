package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_281 {
    private final Production58_281 production = new Production58_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}