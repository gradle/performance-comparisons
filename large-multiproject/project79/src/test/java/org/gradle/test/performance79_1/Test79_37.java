package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_37 {
    private final Production79_37 production = new Production79_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}