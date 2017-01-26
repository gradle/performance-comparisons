package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_299 {
    private final Production33_299 production = new Production33_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}