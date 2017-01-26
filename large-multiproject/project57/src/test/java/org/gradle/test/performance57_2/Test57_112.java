package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_112 {
    private final Production57_112 production = new Production57_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}