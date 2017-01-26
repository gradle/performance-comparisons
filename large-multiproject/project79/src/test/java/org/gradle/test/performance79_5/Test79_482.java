package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_482 {
    private final Production79_482 production = new Production79_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}