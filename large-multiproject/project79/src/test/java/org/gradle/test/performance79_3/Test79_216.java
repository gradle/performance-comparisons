package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_216 {
    private final Production79_216 production = new Production79_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}