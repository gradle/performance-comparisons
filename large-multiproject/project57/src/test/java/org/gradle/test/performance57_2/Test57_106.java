package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_106 {
    private final Production57_106 production = new Production57_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}