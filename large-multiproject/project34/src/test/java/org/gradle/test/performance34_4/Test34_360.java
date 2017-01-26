package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_360 {
    private final Production34_360 production = new Production34_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}