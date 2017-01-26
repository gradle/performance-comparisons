package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_353 {
    private final Production13_353 production = new Production13_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}