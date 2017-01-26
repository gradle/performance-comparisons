package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_326 {
    private final Production57_326 production = new Production57_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}