package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_246 {
    private final Production58_246 production = new Production58_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}