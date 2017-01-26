package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_348 {
    private final Production33_348 production = new Production33_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}