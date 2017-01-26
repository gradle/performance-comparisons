package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_353 {
    private final Production84_353 production = new Production84_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}