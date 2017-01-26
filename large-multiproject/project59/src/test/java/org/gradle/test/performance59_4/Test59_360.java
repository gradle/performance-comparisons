package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_360 {
    private final Production59_360 production = new Production59_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}