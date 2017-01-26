package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_353 {
    private final Production41_353 production = new Production41_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}