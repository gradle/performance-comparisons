package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_353 {
    private final Production57_353 production = new Production57_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}