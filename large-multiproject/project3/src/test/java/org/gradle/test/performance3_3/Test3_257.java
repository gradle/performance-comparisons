package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_257 {
    private final Production3_257 production = new Production3_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}