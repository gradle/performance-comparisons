package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_379 {
    private final Production79_379 production = new Production79_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}