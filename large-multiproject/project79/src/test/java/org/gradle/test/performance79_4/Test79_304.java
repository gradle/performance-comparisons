package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_304 {
    private final Production79_304 production = new Production79_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}