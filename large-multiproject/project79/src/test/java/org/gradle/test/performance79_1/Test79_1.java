package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_1 {
    private final Production79_1 production = new Production79_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}