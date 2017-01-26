package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_302 {
    private final Production34_302 production = new Production34_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}