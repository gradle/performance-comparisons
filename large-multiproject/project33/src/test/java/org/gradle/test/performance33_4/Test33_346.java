package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_346 {
    private final Production33_346 production = new Production33_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}