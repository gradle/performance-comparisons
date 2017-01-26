package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_171 {
    private final Production34_171 production = new Production34_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}