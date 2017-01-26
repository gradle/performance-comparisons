package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_312 {
    private final Production33_312 production = new Production33_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}