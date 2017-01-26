package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_12 {
    private final Production34_12 production = new Production34_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}