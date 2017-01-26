package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_488 {
    private final Production34_488 production = new Production34_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}