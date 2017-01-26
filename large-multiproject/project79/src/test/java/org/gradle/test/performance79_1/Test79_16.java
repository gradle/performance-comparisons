package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_16 {
    private final Production79_16 production = new Production79_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}