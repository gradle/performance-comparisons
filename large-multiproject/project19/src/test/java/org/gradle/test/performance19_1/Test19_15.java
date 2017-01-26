package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_15 {
    private final Production19_15 production = new Production19_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}