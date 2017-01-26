package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_96 {
    private final Production18_96 production = new Production18_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}