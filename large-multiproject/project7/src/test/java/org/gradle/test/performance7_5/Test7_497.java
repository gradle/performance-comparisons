package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_497 {
    private final Production7_497 production = new Production7_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}