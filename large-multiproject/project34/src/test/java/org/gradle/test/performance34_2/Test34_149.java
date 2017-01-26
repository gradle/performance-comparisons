package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_149 {
    private final Production34_149 production = new Production34_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}