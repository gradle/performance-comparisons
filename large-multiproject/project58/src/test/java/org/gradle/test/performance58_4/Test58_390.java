package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_390 {
    private final Production58_390 production = new Production58_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}