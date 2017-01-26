package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_267 {
    private final Production57_267 production = new Production57_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}