package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_163 {
    private final Production2_163 production = new Production2_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}