package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_394 {
    private final Production33_394 production = new Production33_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}