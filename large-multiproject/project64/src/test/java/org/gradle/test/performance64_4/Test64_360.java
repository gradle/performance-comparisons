package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_360 {
    private final Production64_360 production = new Production64_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}