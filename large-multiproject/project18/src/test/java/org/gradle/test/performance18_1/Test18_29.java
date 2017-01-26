package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_29 {
    private final Production18_29 production = new Production18_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}