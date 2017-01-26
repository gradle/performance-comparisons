package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_105 {
    private final Production79_105 production = new Production79_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}