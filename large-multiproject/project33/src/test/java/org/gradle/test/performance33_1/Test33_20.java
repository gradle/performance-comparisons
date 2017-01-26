package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_20 {
    private final Production33_20 production = new Production33_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}