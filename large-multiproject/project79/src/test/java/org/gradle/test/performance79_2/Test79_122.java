package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_122 {
    private final Production79_122 production = new Production79_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}