package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_256 {
    private final Production34_256 production = new Production34_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}