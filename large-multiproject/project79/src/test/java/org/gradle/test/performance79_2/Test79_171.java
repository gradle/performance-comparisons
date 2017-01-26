package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_171 {
    private final Production79_171 production = new Production79_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}