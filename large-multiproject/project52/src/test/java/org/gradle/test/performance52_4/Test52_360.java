package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_360 {
    private final Production52_360 production = new Production52_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}