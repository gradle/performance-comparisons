package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_63 {
    private final Production79_63 production = new Production79_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}