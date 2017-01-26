package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_87 {
    private final Production34_87 production = new Production34_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}