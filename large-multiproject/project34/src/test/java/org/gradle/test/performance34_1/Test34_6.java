package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_6 {
    private final Production34_6 production = new Production34_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}