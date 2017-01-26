package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_77 {
    private final Production57_77 production = new Production57_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}