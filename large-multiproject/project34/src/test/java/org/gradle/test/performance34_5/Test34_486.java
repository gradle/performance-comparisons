package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_486 {
    private final Production34_486 production = new Production34_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}