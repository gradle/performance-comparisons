package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_266 {
    private final Production58_266 production = new Production58_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}