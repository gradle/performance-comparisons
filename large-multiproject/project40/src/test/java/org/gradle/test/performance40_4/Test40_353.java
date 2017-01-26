package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_353 {
    private final Production40_353 production = new Production40_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}