package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_256 {
    private final Production33_256 production = new Production33_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}