package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_19 {
    private final Production79_19 production = new Production79_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}