package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_479 {
    private final Production79_479 production = new Production79_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}