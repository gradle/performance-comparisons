package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_353 {
    private final Production48_353 production = new Production48_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}