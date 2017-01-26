package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_261 {
    private final Production33_261 production = new Production33_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}