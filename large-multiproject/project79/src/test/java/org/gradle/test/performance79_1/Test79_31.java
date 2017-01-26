package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_31 {
    private final Production79_31 production = new Production79_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}