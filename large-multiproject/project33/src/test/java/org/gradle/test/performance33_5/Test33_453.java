package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_453 {
    private final Production33_453 production = new Production33_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}