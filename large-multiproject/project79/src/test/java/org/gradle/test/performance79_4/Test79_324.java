package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_324 {
    private final Production79_324 production = new Production79_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}