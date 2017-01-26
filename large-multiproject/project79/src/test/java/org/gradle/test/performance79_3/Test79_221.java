package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_221 {
    private final Production79_221 production = new Production79_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}