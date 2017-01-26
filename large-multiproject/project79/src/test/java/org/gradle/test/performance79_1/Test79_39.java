package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_39 {
    private final Production79_39 production = new Production79_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}