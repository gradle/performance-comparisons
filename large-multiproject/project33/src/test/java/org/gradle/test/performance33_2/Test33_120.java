package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_120 {
    private final Production33_120 production = new Production33_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}