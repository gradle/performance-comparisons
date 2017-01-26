package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_176 {
    private final Production34_176 production = new Production34_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}