package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_114 {
    private final Production79_114 production = new Production79_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}