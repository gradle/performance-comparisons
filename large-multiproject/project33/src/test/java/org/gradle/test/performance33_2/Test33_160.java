package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_160 {
    private final Production33_160 production = new Production33_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}