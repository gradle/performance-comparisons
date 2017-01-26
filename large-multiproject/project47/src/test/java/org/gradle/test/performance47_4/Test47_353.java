package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_353 {
    private final Production47_353 production = new Production47_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}