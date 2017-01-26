package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_203 {
    private final Production79_203 production = new Production79_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}