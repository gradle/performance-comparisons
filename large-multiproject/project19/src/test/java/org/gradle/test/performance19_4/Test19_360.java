package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_360 {
    private final Production19_360 production = new Production19_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}