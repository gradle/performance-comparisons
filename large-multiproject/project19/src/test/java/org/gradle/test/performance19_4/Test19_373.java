package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_373 {
    private final Production19_373 production = new Production19_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}