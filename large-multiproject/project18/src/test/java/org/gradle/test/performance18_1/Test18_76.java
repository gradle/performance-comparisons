package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_76 {
    private final Production18_76 production = new Production18_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}