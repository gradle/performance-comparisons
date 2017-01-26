package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_279 {
    private final Production33_279 production = new Production33_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}