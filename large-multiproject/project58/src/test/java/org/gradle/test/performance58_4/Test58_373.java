package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_373 {
    private final Production58_373 production = new Production58_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}