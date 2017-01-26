package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_272 {
    private final Production33_272 production = new Production33_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}