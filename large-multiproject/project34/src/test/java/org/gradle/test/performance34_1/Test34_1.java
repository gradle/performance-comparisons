package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_1 {
    private final Production34_1 production = new Production34_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}