package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_88 {
    private final Production18_88 production = new Production18_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}