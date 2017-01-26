package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_85 {
    private final Production55_85 production = new Production55_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}