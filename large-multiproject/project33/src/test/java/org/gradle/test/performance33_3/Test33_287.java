package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_287 {
    private final Production33_287 production = new Production33_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}