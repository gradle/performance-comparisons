package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_62 {
    private final Production18_62 production = new Production18_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}