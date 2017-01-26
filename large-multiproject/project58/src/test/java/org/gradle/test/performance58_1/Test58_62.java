package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_62 {
    private final Production58_62 production = new Production58_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}