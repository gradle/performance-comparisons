package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_480 {
    private final Production33_480 production = new Production33_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}