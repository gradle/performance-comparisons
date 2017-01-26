package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_70 {
    private final Production79_70 production = new Production79_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}