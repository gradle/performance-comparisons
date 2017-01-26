package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_241 {
    private final Production57_241 production = new Production57_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}