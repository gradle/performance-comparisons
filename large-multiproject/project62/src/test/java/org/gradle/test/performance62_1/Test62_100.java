package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_100 {
    private final Production62_100 production = new Production62_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}