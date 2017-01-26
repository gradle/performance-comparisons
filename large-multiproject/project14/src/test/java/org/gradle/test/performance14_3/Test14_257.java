package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_257 {
    private final Production14_257 production = new Production14_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}