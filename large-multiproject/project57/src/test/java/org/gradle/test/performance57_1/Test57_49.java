package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_49 {
    private final Production57_49 production = new Production57_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}