package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_306 {
    private final Production19_306 production = new Production19_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}