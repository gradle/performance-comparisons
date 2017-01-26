package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_330 {
    private final Production18_330 production = new Production18_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}