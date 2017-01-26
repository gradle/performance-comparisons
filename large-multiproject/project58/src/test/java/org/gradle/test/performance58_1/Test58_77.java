package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_77 {
    private final Production58_77 production = new Production58_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}