package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_342 {
    private final Production34_342 production = new Production34_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}