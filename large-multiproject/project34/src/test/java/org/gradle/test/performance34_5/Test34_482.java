package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_482 {
    private final Production34_482 production = new Production34_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}