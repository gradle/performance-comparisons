package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_370 {
    private final Production33_370 production = new Production33_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}