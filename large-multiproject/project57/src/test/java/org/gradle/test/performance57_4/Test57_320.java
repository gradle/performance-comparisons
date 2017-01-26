package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_320 {
    private final Production57_320 production = new Production57_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}