package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_293 {
    private final Production58_293 production = new Production58_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}