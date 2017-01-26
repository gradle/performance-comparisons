package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_157 {
    private final Production18_157 production = new Production18_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}