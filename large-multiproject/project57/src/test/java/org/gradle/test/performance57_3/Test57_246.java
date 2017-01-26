package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_246 {
    private final Production57_246 production = new Production57_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}