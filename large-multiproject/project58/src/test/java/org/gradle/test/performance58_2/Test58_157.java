package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_157 {
    private final Production58_157 production = new Production58_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}