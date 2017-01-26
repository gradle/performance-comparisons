package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_5 {
    private final Production79_5 production = new Production79_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}