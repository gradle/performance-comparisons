package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_413 {
    private final Production33_413 production = new Production33_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}