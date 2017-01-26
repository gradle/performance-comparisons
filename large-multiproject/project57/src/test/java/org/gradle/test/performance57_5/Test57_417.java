package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_417 {
    private final Production57_417 production = new Production57_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}