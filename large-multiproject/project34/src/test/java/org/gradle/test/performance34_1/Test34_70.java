package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_70 {
    private final Production34_70 production = new Production34_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}