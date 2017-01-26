package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_234 {
    private final Production55_234 production = new Production55_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}