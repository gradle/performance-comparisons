package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_438 {
    private final Production34_438 production = new Production34_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}