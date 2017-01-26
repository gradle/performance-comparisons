package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_225 {
    private final Production58_225 production = new Production58_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}