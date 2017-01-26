package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_33 {
    private final Production34_33 production = new Production34_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}