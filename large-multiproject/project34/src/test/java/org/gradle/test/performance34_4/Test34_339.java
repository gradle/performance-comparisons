package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_339 {
    private final Production34_339 production = new Production34_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}