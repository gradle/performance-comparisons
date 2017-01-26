package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_13 {
    private final Production33_13 production = new Production33_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}