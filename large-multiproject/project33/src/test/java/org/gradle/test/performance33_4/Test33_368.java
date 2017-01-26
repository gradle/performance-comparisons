package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_368 {
    private final Production33_368 production = new Production33_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}