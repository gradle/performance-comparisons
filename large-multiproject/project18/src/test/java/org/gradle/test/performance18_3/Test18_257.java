package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_257 {
    private final Production18_257 production = new Production18_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}