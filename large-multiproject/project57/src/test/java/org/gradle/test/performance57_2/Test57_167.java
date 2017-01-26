package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_167 {
    private final Production57_167 production = new Production57_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}