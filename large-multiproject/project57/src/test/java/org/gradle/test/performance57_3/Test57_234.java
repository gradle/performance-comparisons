package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_234 {
    private final Production57_234 production = new Production57_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}