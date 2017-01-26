package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_143 {
    private final Production79_143 production = new Production79_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}