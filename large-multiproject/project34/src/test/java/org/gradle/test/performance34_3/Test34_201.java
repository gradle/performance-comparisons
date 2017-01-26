package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_201 {
    private final Production34_201 production = new Production34_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}