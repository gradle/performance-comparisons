package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_363 {
    private final Production33_363 production = new Production33_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}