package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_124 {
    private final Production33_124 production = new Production33_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}