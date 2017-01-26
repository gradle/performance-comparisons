package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_363 {
    private final Production79_363 production = new Production79_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}