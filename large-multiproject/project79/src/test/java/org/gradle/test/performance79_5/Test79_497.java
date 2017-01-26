package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_497 {
    private final Production79_497 production = new Production79_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}