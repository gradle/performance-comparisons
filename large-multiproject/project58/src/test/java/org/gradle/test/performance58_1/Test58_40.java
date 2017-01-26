package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_40 {
    private final Production58_40 production = new Production58_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}