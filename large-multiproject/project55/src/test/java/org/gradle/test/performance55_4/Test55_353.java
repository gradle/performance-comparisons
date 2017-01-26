package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_353 {
    private final Production55_353 production = new Production55_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}