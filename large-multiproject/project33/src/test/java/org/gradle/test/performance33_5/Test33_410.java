package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_410 {
    private final Production33_410 production = new Production33_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}