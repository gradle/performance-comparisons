package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_154 {
    private final Production79_154 production = new Production79_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}