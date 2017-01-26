package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_81 {
    private final Production34_81 production = new Production34_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}