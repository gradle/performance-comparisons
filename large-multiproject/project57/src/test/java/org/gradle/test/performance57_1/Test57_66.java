package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_66 {
    private final Production57_66 production = new Production57_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}