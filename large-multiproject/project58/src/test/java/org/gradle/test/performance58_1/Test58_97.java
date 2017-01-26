package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_97 {
    private final Production58_97 production = new Production58_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}