package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_79 {
    private final Production34_79 production = new Production34_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}