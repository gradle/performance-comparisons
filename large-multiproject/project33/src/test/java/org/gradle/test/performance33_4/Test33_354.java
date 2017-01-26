package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_354 {
    private final Production33_354 production = new Production33_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}