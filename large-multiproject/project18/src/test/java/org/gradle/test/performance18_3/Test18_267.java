package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_267 {
    private final Production18_267 production = new Production18_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}