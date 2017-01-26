package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_300 {
    private final Production34_300 production = new Production34_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}