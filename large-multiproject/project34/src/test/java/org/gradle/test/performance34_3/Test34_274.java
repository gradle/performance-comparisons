package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_274 {
    private final Production34_274 production = new Production34_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}