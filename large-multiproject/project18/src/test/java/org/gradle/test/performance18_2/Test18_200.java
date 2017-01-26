package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_200 {
    private final Production18_200 production = new Production18_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}