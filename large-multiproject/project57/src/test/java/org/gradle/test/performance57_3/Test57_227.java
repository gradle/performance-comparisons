package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_227 {
    private final Production57_227 production = new Production57_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}