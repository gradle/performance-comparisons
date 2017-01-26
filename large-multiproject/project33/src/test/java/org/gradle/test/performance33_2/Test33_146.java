package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_146 {
    private final Production33_146 production = new Production33_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}