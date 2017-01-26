package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_271 {
    private final Production34_271 production = new Production34_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}