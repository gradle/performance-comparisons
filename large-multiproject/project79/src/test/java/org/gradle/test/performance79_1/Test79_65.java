package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_65 {
    private final Production79_65 production = new Production79_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}