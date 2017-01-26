package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_349 {
    private final Production33_349 production = new Production33_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}