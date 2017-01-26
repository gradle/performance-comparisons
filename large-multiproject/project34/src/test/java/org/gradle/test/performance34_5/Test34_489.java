package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_489 {
    private final Production34_489 production = new Production34_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}