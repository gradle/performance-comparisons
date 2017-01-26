package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_93 {
    private final Production18_93 production = new Production18_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}