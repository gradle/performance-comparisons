package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_209 {
    private final Production57_209 production = new Production57_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}