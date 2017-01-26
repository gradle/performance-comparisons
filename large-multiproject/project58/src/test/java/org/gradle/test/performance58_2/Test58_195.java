package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_195 {
    private final Production58_195 production = new Production58_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}