package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_387 {
    private final Production34_387 production = new Production34_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}