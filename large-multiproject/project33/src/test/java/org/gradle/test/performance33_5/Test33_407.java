package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_407 {
    private final Production33_407 production = new Production33_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}