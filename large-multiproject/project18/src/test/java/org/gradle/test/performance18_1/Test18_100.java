package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_100 {
    private final Production18_100 production = new Production18_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}