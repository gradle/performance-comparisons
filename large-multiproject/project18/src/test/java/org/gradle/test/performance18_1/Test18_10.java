package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_10 {
    private final Production18_10 production = new Production18_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}