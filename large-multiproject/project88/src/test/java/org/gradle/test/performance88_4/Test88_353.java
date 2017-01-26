package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_353 {
    private final Production88_353 production = new Production88_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}