package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_458 {
    private final Production57_458 production = new Production57_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}