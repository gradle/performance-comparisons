package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_151 {
    private final Production34_151 production = new Production34_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}