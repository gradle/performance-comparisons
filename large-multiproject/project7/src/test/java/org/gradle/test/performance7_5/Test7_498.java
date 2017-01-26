package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_498 {
    private final Production7_498 production = new Production7_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}