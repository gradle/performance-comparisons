package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_209 {
    private final Production58_209 production = new Production58_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}