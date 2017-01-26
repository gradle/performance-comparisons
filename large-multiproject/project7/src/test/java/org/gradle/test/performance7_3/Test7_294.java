package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_294 {
    private final Production7_294 production = new Production7_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}