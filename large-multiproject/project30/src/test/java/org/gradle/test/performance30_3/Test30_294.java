package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_294 {
    private final Production30_294 production = new Production30_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}