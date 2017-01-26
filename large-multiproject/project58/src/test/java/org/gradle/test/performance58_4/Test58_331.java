package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_331 {
    private final Production58_331 production = new Production58_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}