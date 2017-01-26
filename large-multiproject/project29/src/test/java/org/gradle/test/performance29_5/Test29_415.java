package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_415 {
    private final Production29_415 production = new Production29_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}