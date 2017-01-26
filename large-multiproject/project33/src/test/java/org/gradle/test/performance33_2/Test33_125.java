package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_125 {
    private final Production33_125 production = new Production33_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}