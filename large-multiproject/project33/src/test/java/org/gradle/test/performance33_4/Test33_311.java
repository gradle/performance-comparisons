package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_311 {
    private final Production33_311 production = new Production33_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}