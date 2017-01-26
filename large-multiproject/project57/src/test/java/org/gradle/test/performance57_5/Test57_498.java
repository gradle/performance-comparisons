package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_498 {
    private final Production57_498 production = new Production57_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}