package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_86 {
    private final Production34_86 production = new Production34_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}