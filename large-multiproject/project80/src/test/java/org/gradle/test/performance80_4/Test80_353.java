package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_353 {
    private final Production80_353 production = new Production80_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}