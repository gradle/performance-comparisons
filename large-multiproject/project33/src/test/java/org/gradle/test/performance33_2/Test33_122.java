package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_122 {
    private final Production33_122 production = new Production33_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}