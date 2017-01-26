package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_266 {
    private final Production18_266 production = new Production18_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}