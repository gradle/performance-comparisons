package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_438 {
    private final Production33_438 production = new Production33_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}