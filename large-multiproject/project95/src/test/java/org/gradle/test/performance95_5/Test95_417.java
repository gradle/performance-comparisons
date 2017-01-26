package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_417 {
    private final Production95_417 production = new Production95_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}