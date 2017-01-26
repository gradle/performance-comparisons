package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_332 {
    private final Production33_332 production = new Production33_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}