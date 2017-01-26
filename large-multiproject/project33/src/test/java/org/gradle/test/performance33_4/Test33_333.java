package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_333 {
    private final Production33_333 production = new Production33_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}