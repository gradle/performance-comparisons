package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_141 {
    private final Production33_141 production = new Production33_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}