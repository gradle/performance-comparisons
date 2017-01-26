package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_306 {
    private final Production34_306 production = new Production34_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}