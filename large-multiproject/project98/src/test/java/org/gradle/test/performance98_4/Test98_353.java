package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_353 {
    private final Production98_353 production = new Production98_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}