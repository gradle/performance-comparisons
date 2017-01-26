package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_182 {
    private final Production79_182 production = new Production79_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}