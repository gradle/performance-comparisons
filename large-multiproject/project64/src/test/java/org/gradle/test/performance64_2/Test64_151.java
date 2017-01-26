package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_151 {
    private final Production64_151 production = new Production64_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}