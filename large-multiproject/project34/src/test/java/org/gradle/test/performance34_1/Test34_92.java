package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_92 {
    private final Production34_92 production = new Production34_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}