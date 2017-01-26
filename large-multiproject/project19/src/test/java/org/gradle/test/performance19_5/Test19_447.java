package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_447 {
    private final Production19_447 production = new Production19_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}