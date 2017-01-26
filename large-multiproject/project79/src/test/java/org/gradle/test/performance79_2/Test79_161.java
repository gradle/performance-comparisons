package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_161 {
    private final Production79_161 production = new Production79_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}