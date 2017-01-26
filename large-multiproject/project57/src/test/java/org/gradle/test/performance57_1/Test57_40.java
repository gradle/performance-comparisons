package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_40 {
    private final Production57_40 production = new Production57_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}