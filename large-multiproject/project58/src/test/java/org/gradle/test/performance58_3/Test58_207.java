package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_207 {
    private final Production58_207 production = new Production58_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}