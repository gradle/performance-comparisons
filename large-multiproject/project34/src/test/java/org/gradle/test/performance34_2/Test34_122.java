package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_122 {
    private final Production34_122 production = new Production34_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}