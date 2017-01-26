package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_498 {
    private final Production20_498 production = new Production20_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}