package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_110 {
    private final Production33_110 production = new Production33_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}