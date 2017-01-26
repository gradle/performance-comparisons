package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_423 {
    private final Production79_423 production = new Production79_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}