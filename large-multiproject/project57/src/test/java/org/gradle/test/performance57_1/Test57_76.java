package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_76 {
    private final Production57_76 production = new Production57_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}