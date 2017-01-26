package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_8 {
    private final Production34_8 production = new Production34_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}