package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_93 {
    private final Production58_93 production = new Production58_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}