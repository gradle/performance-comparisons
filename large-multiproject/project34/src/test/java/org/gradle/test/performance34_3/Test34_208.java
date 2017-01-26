package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_208 {
    private final Production34_208 production = new Production34_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}