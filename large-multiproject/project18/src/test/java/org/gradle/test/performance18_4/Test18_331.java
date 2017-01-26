package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_331 {
    private final Production18_331 production = new Production18_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}