package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_257 {
    private final Production74_257 production = new Production74_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}