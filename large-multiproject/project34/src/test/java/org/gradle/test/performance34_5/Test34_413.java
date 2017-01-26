package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_413 {
    private final Production34_413 production = new Production34_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}