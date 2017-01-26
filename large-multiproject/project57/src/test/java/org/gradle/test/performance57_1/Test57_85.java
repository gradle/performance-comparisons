package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_85 {
    private final Production57_85 production = new Production57_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}