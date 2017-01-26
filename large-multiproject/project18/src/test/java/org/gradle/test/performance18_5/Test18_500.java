package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_500 {
    private final Production18_500 production = new Production18_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}