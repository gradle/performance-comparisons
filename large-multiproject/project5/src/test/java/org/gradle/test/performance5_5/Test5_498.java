package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_498 {
    private final Production5_498 production = new Production5_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}