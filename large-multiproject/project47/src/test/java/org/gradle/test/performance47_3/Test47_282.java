package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_282 {
    private final Production47_282 production = new Production47_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}