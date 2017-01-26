package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_68 {
    private final Production57_68 production = new Production57_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}