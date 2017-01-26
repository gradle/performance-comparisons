package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_60 {
    private final Production34_60 production = new Production34_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}