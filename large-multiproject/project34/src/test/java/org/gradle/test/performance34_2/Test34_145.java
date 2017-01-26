package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_145 {
    private final Production34_145 production = new Production34_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}