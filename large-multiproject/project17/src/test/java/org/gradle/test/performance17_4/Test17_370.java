package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_370 {
    private final Production17_370 production = new Production17_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}