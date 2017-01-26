package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_136 {
    private final Production33_136 production = new Production33_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}