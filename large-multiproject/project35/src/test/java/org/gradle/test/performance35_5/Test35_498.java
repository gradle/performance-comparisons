package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_498 {
    private final Production35_498 production = new Production35_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}