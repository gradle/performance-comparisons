package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_72 {
    private final Production18_72 production = new Production18_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}