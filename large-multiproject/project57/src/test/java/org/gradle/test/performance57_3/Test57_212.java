package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_212 {
    private final Production57_212 production = new Production57_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}