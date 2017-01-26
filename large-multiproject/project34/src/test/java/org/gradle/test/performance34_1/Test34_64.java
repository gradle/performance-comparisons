package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_64 {
    private final Production34_64 production = new Production34_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}