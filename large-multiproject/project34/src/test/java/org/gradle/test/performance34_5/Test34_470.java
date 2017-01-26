package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_470 {
    private final Production34_470 production = new Production34_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}