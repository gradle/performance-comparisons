package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_96 {
    private final Production57_96 production = new Production57_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}