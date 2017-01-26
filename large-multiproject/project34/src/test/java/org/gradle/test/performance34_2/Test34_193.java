package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_193 {
    private final Production34_193 production = new Production34_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}