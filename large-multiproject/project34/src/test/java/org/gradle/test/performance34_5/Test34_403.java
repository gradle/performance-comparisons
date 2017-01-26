package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_403 {
    private final Production34_403 production = new Production34_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}