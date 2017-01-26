package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_402 {
    private final Production33_402 production = new Production33_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}