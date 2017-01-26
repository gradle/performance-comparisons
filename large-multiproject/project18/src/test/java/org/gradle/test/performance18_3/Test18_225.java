package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_225 {
    private final Production18_225 production = new Production18_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}