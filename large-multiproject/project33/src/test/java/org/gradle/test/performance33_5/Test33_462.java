package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_462 {
    private final Production33_462 production = new Production33_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}