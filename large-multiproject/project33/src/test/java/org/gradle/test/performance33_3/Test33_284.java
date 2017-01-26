package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_284 {
    private final Production33_284 production = new Production33_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}