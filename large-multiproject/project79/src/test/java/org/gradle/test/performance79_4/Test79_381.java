package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_381 {
    private final Production79_381 production = new Production79_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}