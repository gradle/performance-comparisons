package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_58 {
    private final Production18_58 production = new Production18_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}