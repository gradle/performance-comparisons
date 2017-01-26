package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_151 {
    private final Production52_151 production = new Production52_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}