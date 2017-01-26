package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_338 {
    private final Production18_338 production = new Production18_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}