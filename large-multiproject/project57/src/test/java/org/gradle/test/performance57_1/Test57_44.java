package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_44 {
    private final Production57_44 production = new Production57_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}