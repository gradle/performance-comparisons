package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_498 {
    private final Production58_498 production = new Production58_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}