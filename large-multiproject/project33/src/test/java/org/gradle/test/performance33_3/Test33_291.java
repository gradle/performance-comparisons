package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_291 {
    private final Production33_291 production = new Production33_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}