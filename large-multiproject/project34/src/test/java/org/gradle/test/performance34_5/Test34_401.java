package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_401 {
    private final Production34_401 production = new Production34_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}