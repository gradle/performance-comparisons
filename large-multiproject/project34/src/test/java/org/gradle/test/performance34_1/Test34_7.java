package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_7 {
    private final Production34_7 production = new Production34_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}