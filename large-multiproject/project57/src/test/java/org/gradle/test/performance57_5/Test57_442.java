package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_442 {
    private final Production57_442 production = new Production57_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}