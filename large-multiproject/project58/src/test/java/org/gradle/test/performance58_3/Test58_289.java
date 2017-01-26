package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_289 {
    private final Production58_289 production = new Production58_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}