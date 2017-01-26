package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_317 {
    private final Production33_317 production = new Production33_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}