package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_163 {
    private final Production34_163 production = new Production34_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}