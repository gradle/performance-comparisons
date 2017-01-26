package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_360 {
    private final Production91_360 production = new Production91_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}