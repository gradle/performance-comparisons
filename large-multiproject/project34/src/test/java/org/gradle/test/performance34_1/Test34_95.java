package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_95 {
    private final Production34_95 production = new Production34_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}