package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_37 {
    private final Production34_37 production = new Production34_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}