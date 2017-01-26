package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_498 {
    private final Production30_498 production = new Production30_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}