package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_257 {
    private final Production30_257 production = new Production30_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}