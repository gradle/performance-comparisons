package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_294 {
    private final Production58_294 production = new Production58_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}