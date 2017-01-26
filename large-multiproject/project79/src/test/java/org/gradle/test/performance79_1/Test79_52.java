package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_52 {
    private final Production79_52 production = new Production79_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}