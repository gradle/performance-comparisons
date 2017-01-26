package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_172 {
    private final Production58_172 production = new Production58_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}