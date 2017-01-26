package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_192 {
    private final Production79_192 production = new Production79_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}