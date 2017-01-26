package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_118 {
    private final Production33_118 production = new Production33_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}