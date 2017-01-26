package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_353 {
    private final Production35_353 production = new Production35_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}