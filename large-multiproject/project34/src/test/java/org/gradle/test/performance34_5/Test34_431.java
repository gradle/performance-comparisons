package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_431 {
    private final Production34_431 production = new Production34_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}