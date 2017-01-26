package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_340 {
    private final Production34_340 production = new Production34_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}