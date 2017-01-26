package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_19 {
    private final Production34_19 production = new Production34_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}