package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_463 {
    private final Production33_463 production = new Production33_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}