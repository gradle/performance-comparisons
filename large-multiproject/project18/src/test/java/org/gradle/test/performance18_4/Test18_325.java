package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_325 {
    private final Production18_325 production = new Production18_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}