package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_384 {
    private final Production33_384 production = new Production33_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}