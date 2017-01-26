package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_255 {
    private final Production57_255 production = new Production57_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}