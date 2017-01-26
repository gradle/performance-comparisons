package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_104 {
    private final Production34_104 production = new Production34_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}