package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_325 {
    private final Production57_325 production = new Production57_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}