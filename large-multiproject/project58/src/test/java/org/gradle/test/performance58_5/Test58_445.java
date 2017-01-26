package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_445 {
    private final Production58_445 production = new Production58_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}