package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_75 {
    private final Production18_75 production = new Production18_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}