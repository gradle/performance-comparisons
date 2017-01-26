package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_68 {
    private final Production18_68 production = new Production18_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}