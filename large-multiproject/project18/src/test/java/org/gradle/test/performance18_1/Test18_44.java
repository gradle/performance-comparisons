package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_44 {
    private final Production18_44 production = new Production18_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}