package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_257 {
    private final Production99_257 production = new Production99_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}