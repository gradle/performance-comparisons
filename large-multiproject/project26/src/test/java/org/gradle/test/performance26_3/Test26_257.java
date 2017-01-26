package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_257 {
    private final Production26_257 production = new Production26_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}