package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_179 {
    private final Production34_179 production = new Production34_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}