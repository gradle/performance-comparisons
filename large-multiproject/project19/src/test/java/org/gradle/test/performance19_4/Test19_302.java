package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_302 {
    private final Production19_302 production = new Production19_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}