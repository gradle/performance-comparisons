package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_177 {
    private final Production33_177 production = new Production33_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}