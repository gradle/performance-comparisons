package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_259 {
    private final Production57_259 production = new Production57_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}