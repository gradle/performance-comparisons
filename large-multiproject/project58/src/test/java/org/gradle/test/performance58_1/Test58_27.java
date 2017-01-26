package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_27 {
    private final Production58_27 production = new Production58_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}