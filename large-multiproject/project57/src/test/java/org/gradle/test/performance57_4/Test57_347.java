package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_347 {
    private final Production57_347 production = new Production57_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}