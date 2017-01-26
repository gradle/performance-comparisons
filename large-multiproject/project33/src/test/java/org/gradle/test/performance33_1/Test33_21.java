package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_21 {
    private final Production33_21 production = new Production33_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}