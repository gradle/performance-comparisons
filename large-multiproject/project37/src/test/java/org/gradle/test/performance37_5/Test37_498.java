package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_498 {
    private final Production37_498 production = new Production37_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}