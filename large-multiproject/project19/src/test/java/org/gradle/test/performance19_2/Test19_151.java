package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_151 {
    private final Production19_151 production = new Production19_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}