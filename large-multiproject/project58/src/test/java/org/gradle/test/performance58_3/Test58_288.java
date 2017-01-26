package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_288 {
    private final Production58_288 production = new Production58_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}