package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_106 {
    private final Production34_106 production = new Production34_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}