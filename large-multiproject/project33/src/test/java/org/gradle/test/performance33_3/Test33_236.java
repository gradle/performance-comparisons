package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_236 {
    private final Production33_236 production = new Production33_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}