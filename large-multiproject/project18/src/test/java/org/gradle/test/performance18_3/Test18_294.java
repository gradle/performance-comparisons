package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_294 {
    private final Production18_294 production = new Production18_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}