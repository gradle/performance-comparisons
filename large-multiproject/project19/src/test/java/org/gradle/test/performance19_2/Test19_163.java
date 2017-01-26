package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_163 {
    private final Production19_163 production = new Production19_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}