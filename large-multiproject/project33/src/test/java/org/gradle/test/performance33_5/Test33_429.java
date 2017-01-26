package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_429 {
    private final Production33_429 production = new Production33_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}