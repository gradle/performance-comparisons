package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_4 {
    private final Production79_4 production = new Production79_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}