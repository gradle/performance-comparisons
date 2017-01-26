package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_44 {
    private final Production58_44 production = new Production58_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}