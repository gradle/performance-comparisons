package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_358 {
    private final Production18_358 production = new Production18_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}