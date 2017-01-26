package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_492 {
    private final Production34_492 production = new Production34_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}