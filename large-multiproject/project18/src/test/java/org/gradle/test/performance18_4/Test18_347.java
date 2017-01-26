package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_347 {
    private final Production18_347 production = new Production18_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}