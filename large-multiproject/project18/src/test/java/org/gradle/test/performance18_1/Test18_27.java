package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_27 {
    private final Production18_27 production = new Production18_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}