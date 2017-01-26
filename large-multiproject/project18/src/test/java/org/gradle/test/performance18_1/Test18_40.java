package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_40 {
    private final Production18_40 production = new Production18_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}