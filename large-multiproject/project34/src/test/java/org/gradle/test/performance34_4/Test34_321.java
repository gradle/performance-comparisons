package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_321 {
    private final Production34_321 production = new Production34_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}