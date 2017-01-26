package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_236 {
    private final Production91_236 production = new Production91_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}