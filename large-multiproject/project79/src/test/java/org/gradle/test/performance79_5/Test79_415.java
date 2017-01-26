package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_415 {
    private final Production79_415 production = new Production79_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}