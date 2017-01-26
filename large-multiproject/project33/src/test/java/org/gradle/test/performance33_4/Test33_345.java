package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_345 {
    private final Production33_345 production = new Production33_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}