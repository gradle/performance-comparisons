package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_7 {
    private final Production79_7 production = new Production79_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}