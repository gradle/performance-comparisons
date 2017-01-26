package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_462 {
    private final Production79_462 production = new Production79_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}