package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_103 {
    private final Production34_103 production = new Production34_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}