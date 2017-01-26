package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_280 {
    private final Production33_280 production = new Production33_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}