package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_461 {
    private final Production10_461 production = new Production10_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}