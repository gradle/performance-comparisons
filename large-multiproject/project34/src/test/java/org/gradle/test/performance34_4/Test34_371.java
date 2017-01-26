package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_371 {
    private final Production34_371 production = new Production34_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}