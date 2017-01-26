package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_257 {
    private final Production7_257 production = new Production7_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}