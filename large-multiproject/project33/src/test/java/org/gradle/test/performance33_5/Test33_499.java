package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_499 {
    private final Production33_499 production = new Production33_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}