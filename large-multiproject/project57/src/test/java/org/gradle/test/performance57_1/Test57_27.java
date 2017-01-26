package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_27 {
    private final Production57_27 production = new Production57_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}