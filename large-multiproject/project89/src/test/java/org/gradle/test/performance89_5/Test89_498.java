package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_498 {
    private final Production89_498 production = new Production89_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}