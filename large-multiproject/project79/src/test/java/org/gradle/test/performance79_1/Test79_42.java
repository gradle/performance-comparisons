package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_42 {
    private final Production79_42 production = new Production79_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}