package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_80 {
    private final Production18_80 production = new Production18_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}