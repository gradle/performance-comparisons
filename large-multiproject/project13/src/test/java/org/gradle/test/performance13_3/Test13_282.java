package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_282 {
    private final Production13_282 production = new Production13_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}