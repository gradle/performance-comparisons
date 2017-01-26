package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_295 {
    private final Production33_295 production = new Production33_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}