package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_257 {
    private final Production62_257 production = new Production62_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}