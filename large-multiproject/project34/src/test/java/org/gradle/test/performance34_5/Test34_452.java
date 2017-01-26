package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_452 {
    private final Production34_452 production = new Production34_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}