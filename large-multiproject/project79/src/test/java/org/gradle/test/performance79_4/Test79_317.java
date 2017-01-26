package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_317 {
    private final Production79_317 production = new Production79_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}