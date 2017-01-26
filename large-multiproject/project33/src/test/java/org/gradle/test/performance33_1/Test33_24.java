package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_24 {
    private final Production33_24 production = new Production33_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}